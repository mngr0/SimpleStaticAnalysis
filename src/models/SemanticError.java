package models;

public class SemanticError {
	
	String errorDescription;
	
	//it should be good to have also 
	//int errorLine;
	//int errorColumn;
	
	public SemanticError(String errorDescription){
		this.errorDescription = errorDescription;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return errorDescription;
	}
}
