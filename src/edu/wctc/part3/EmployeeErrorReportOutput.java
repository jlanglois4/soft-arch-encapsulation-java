package edu.wctc.part3;

import java.util.Objects;

public class EmployeeErrorReportOutput {

    public void reportOutput(String type){
        if (Objects.equals(type, "ssn")){
            if (type.length() < 9 || type.length() > 11) { // Magic numbers!
                throw new IllegalArgumentException(String.format("%s is required and must be "
                        + "between 9 and 11 characters (if hyphens are used)",type));
            }
        } else {
            if (type == null || type.isBlank()) {
                throw new IllegalArgumentException(String.format("%s is required",type));
            }
        }
    }
}
