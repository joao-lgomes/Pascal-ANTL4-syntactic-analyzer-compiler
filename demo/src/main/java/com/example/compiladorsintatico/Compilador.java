package com.example.compiladorsintatico;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Compilador {
    private String codigo;

    public Compilador(String codigo) {
        this.codigo = codigo;
    }

    public void compile() {
        CharStream input = CharStreams.fromString(this.codigo);
        GramaticaLexer lexer = new GramaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            int tokenType = token.getType();
            String nome = lexer.getVocabulary().getSymbolicName(tokenType);
            String texto = token.getText();
            int linha = token.getLine();
            int coluna = token.getCharPositionInLine();
            System.out.println("Token: (tipo: " + nome + " | conteudo: " + texto + ") --> Posicoes: (Linha: " + linha + " | Coluna: " + coluna+ " | Tamanho: "+texto.length()+")");
        }
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree tree = parser.program();
    }
}
