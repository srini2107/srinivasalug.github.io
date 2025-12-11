//package com.aws.lambda.application;
//
//
//import com.amazonaws.services.lambda.runtime.Context;
//import com.amazonaws.services.lambda.runtime.RequestHandler;
//import java.util.Map;
//
//public class ApiLambdaHandler implements RequestHandler<Map<String, Object>, String> {
//
//    @Override
//    public String handleRequest(Map<String, Object> input, Context context) {
//        context.getLogger().log("Input: " + input);
//
//        // Example: extract path parameter "id"
//        Map<String, String> pathParams = (Map<String, String>) input.get("pathParameters");
//        String id = pathParams != null ? pathParams.get("id") : "unknown";
//
//        return "Customer ID received: " + id;
//    }
//
//    //test
//}
