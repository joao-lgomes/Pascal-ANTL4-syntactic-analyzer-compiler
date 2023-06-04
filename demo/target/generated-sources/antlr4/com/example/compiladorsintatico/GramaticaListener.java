// Generated from com\example\compiladorsintatico\Gramatica.g4 by ANTLR 4.12.0
package com.example.compiladorsintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(GramaticaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(GramaticaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(GramaticaParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(GramaticaParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(GramaticaParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(GramaticaParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(GramaticaParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(GramaticaParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(GramaticaParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(GramaticaParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(GramaticaParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(GramaticaParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(GramaticaParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(GramaticaParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(GramaticaParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(GramaticaParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(GramaticaParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(GramaticaParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(GramaticaParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(GramaticaParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(GramaticaParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(GramaticaParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(GramaticaParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(GramaticaParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(GramaticaParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(GramaticaParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(GramaticaParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(GramaticaParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(GramaticaParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(GramaticaParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(GramaticaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(GramaticaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(GramaticaParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(GramaticaParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(GramaticaParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(GramaticaParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(GramaticaParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(GramaticaParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(GramaticaParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(GramaticaParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(GramaticaParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(GramaticaParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(GramaticaParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(GramaticaParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(GramaticaParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(GramaticaParser.IntnumContext ctx);
}