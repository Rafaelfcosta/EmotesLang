/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.ui.rsa;

import javax.swing.text.Segment;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

/**
 *
 * @author rafae
 */
public class EmotesTokenMaker extends AbstractTokenMaker{

    int currentTokenStart = 0;
    int currentTokenType = 0;
    
    @Override
    public TokenMap getWordsToHighlight() {
        TokenMap tokenMap = new TokenMap();
  
        tokenMap.put("int",  Token.DATA_TYPE);
        tokenMap.put("bin",   Token.DATA_TYPE);
        tokenMap.put("hex",    Token.DATA_TYPE);
        tokenMap.put("double", Token.DATA_TYPE);
        tokenMap.put("float", Token.DATA_TYPE);
        tokenMap.put("char", Token.DATA_TYPE);
        tokenMap.put("string", Token.DATA_TYPE);
        tokenMap.put("boolean", Token.DATA_TYPE);
        tokenMap.put("void", Token.DATA_TYPE);
        
        tokenMap.put("HeyGuys", Token.RESERVED_WORD);
        tokenMap.put("RIP", Token.RESERVED_WORD);
        tokenMap.put("imOut", Token.RESERVED_WORD);
        tokenMap.put("TriHard", Token.RESERVED_WORD);
        tokenMap.put("GivePLZ", Token.RESERVED_WORD);
        tokenMap.put("Bonfire", Token.RESERVED_WORD);
        tokenMap.put("pikaHi", Token.RESERVED_WORD);
        tokenMap.put("seaPika", Token.RESERVED_WORD);
        tokenMap.put("pikaOH", Token.RESERVED_WORD);
        tokenMap.put("jerryWhat", Token.RESERVED_WORD);
        tokenMap.put("Triggered", Token.RESERVED_WORD);
        tokenMap.put("WaitWhat", Token.RESERVED_WORD);
        tokenMap.put("BabyRage", Token.RESERVED_WORD);
        tokenMap.put("4Head", Token.RESERVED_WORD);
        tokenMap.put("Woah", Token.RESERVED_WORD);
        tokenMap.put("justDOIT", Token.RESERVED_WORD);
        
        tokenMap.put("CoolCat", Token.RESERVED_WORD);
        tokenMap.put("FatCat", Token.RESERVED_WORD);
                
        tokenMap.put("+", Token.OPERATOR);
        tokenMap.put("-", Token.OPERATOR);
        tokenMap.put("*", Token.OPERATOR);
        tokenMap.put("/", Token.OPERATOR);
        tokenMap.put("%", Token.OPERATOR);
        
        tokenMap.put("<", Token.OPERATOR);
        tokenMap.put(">", Token.OPERATOR);
        tokenMap.put("=", Token.OPERATOR);
        tokenMap.put("<=", Token.OPERATOR);
        tokenMap.put(">=", Token.OPERATOR);
        tokenMap.put("==", Token.OPERATOR);
        tokenMap.put("!=", Token.OPERATOR);
        
        tokenMap.put("<<", Token.OPERATOR);
        tokenMap.put(">>", Token.OPERATOR);
        tokenMap.put("|", Token.OPERATOR);
        tokenMap.put("&", Token.OPERATOR);
        tokenMap.put("~", Token.OPERATOR);
        tokenMap.put("^", Token.OPERATOR);
        
        tokenMap.put("&&", Token.OPERATOR);
        tokenMap.put("||", Token.OPERATOR);
        tokenMap.put("NotLikeThis", Token.OPERATOR);
        
        tokenMap.put(",", Token.SEPARATOR);
        tokenMap.put("Kappa", Token.SEPARATOR);
        tokenMap.put("KappaPride", Token.SEPARATOR);
        tokenMap.put("Clap", Token.SEPARATOR);
        
        tokenMap.put("P(", Token.RESERVED_WORD_2);
        tokenMap.put(")G", Token.RESERVED_WORD_2);
        

        tokenMap.put("GivePLZ", Token.FUNCTION);
        tokenMap.put("Bonfire",  Token.FUNCTION);

        return tokenMap;
    }
    
    @Override
    public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
        // This assumes all keywords, etc. were parsed as "identifiers."
        if (tokenType==Token.IDENTIFIER) {
           int value = wordsToHighlight.get(segment, start, end);
           if (value != -1) {
              tokenType = value;
           }
        }
        super.addToken(segment, start, end, tokenType, startOffset);
    }

    @Override
    public Token getTokenList(Segment text, int startTokenType, int startOffset) {
       resetTokenList();

        char[] array = text.array;
        int offset = text.offset;
        int count = text.count;
        int end = offset + count;

        // Token starting offsets are always of the form:
        // 'startOffset + (currentTokenStart-offset)', but since startOffset and
        // offset are constant, tokens' starting positions become:
        // 'newStartOffset+currentTokenStart'.
        int newStartOffset = startOffset - offset;

        currentTokenStart = offset;
        currentTokenType  = startTokenType;

        for (int i=offset; i<end; i++) {

           char c = array[i];

           switch (currentTokenType) {

              case Token.NULL:

                 currentTokenStart = i;   // Starting a new token here.

                 switch (c) {

                    case ' ':
                    case '\t':
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    case '#':
                       currentTokenType = Token.COMMENT_EOL;
                       break;

                    default:
                       if (RSyntaxUtilities.isDigit(c)) {
                          currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                          break;
                       }
                       else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                          currentTokenType = Token.IDENTIFIER;
                          break;
                       }

                       // Anything not currently handled - mark as an identifier
                       currentTokenType = Token.IDENTIFIER;
                       break;

                 } // End of switch (c).

                 break;

              case Token.WHITESPACE:

                 switch (c) {

                    case ' ':
                    case '\t':
                       break;   // Still whitespace.

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    case '#':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.COMMENT_EOL;
                       break;

                    default:   // Add the whitespace token and start anew.

                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;

                       if (RSyntaxUtilities.isDigit(c)) {
                          currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                          break;
                       }
                       else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                          currentTokenType = Token.IDENTIFIER;
                          break;
                       }

                       // Anything not currently handled - mark as identifier
                       currentTokenType = Token.IDENTIFIER;

                 } // End of switch (c).

                 break;

              default: // Should never happen
              case Token.IDENTIFIER:

                 switch (c) {

                    case ' ':
                    case '\t':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    default:
                       if (RSyntaxUtilities.isLetterOrDigit(c) || c=='/' || c=='_') {
                          break;   // Still an identifier of some type.
                       }
                       // Otherwise, we're still an identifier (?).

                 } // End of switch (c).

                 break;

              case Token.LITERAL_NUMBER_DECIMAL_INT:

                 switch (c) {

                    case ' ':
                    case '\t':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    default:

                       if (RSyntaxUtilities.isDigit(c)) {
                          break;   // Still a literal number.
                       }

                       // Otherwise, remember this was a number and start over.
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       i--;
                       currentTokenType = Token.NULL;

                 } // End of switch (c).

                 break;

              case Token.COMMENT_EOL:
                 i = end - 1;
                 addToken(text, currentTokenStart,i, currentTokenType, newStartOffset+currentTokenStart);
                 // We need to set token type to null so at the bottom we don't add one more token.
                 currentTokenType = Token.NULL;
                 break;

              case Token.LITERAL_STRING_DOUBLE_QUOTE:
                 if (c=='"') {
                    addToken(text, currentTokenStart,i, Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset+currentTokenStart);
                    currentTokenType = Token.NULL;
                 }
                 break;
              case Token.LITERAL_CHAR:
                 if (c=='\'') {
                    addToken(text, currentTokenStart,i, Token.LITERAL_CHAR, newStartOffset+currentTokenStart);
                    currentTokenType = Token.NULL;
                 }
                 break;

           } // End of switch (currentTokenType).

        } // End of for (int i=offset; i<end; i++).

        switch (currentTokenType) {

           // Remember what token type to begin the next line with.
           case Token.LITERAL_STRING_DOUBLE_QUOTE:
              addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
              break;

           // Do nothing if everything was okay.
           case Token.NULL:
              addNullToken();
              break;

           // All other token types don't continue to the next line...
           default:
              addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
              addNullToken();

        }

        // Return the first token in our linked list.
        return firstToken;
    }
   
}
