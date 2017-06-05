package br.com.correios.api.converter;

/**
* Interface para converção de um Objeto(F) para outro Objeto(T)
*/
public interface Converter<F,T> {

	T convert(F from);
}
