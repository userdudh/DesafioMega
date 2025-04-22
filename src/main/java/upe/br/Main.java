package upe.br;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**

 * Classe que obtém os números do último sorteio da mega-sena.

 */

public class ResultadoMegasena {
    /** URL que possui as dezenas sorteadas. */
    private final static String URL =

            "http://www1.caixa.gov.br/_newincludes/home_2011/resultado_megasena.asp

";

    /** Marcação inicial para extrair as dezenas do retorno HTML. */
    private final static String MARCA_INICIAL_RETORNO_NAO_UTIL = "<div

    id='concurso_resultado'>";

    /** Marcação final para extrair as dezenas do retorno HTML. */
    private final static String MARCA_FINAL_RETORNO_NAO_UTIL =

            "</div>";