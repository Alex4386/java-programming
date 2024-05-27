package me.alex4386.gachon.network.common.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class HttpResponse {
    public HttpResponseCode code;
    public String response;

    boolean enableDebug = false;

    public HttpResponse(HttpURLConnection conn) throws IOException {
        int responseCode = conn.getResponseCode();
        this.code = HttpResponseCode.getResponse(responseCode);

        BufferedReader bufReader;

        if (this.code.isOK()) {
            bufReader = new BufferedReader(
                    new InputStreamReader(
                            conn.getInputStream()
                    )
            );
        } else {
            bufReader = new BufferedReader(
                    new InputStreamReader(
                            conn.getErrorStream()
                    )
            );
        }

        StringBuilder stringBuilder = new StringBuilder();
        String thisLine;
        while ((thisLine = bufReader.readLine()) != null) {
            stringBuilder.append(thisLine);
            stringBuilder.append("\n");
        }

        bufReader.close();
        conn.disconnect();

        this.response = stringBuilder.toString();

        if (this.enableDebug) {
            System.out.println("Code: "+this.code.getCode());
            System.out.println("Resp: \n"+this.response);
        }
    }

    @Override
    public String toString() {
        return this.response;
    }
}