package br.com.correios.api.converter;

/**
*
* @author Eric Dallo
* @description Interface para converção de um Objeto(F) para outro Objeto(T)
*/
public interface Converter<F,T> {

	T convert(F from);
}
