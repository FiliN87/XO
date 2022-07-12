package org.filin;

public class UserNameRequest {

    private String anal;
    private String CN;
    private String PIN;

    public String getAnal() {
        return anal;
    }

    public void setAnal(String blackhole) {
        anal = blackhole;
    }
    public void setCn(String blackhole) {
        CN = blackhole;
    }
    public void setPin(String blackhole) {
        PIN = blackhole;
    }

    @Override
    public String toString() {
        return "UserNameRequest{" +
                "anal='" + anal + '\'' +
                ", CN='" + CN + '\'' +
                ", PIN='" + PIN + '\'' +
                '}';
    }
}
