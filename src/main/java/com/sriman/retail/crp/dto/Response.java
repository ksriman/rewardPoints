package com.sriman.retail.crp.dto;

/**
 * The type Response.
 *
 * @param <T> the type parameter
 */
public class Response<T> {
    private String status;
    private String message;
    private T data;

    /**
     * Instantiates a new Response.
     *
     * @param status  the status
     * @param message the message
     * @param data    the data
     */
    public Response(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
