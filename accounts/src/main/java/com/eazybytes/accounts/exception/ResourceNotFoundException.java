package com.eazybytes.accounts.exception;

public class ResourceNotFoundException extends  RuntimeException{

public ResourceNotFoundException(String resourceName, String fieldName, String fieldValues){

    super( String.format("%s not found with given input data %s : %s",resourceName, fieldName,fieldValues));
}



}
