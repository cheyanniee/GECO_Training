package SpringIntro.request;

import org.springframework.http.ResponseEntity;

public class MathRequest {
    int A;
    int B;
    String type;

    public MathRequest(int A, int B, String type) {
        this.A = A;
        this.B = B;
        this.type = type;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}