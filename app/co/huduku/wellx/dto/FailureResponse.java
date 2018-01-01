package co.huduku.wellx.dto;

public class FailureResponse extends Response {
	public FailureResponse(Object error) {
		super.setError(error);
		setSuccess(false);
	}
}
