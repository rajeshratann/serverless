package com.kiralab.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandlerRequest implements RequestHandler<RequestClass , ResponseClass> {

		public ResponseClass handleRequest(RequestClass request, Context context){
	        String greetingString = String.format("Hello %s, %s.", request.firstName, request.lastName);
	        return new ResponseClass(greetingString);
	}

	
	}
