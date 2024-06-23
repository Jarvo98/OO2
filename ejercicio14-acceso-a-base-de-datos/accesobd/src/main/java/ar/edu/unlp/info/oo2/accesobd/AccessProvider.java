package ar.edu.unlp.info.oo2.accesobd;

public class AccessProvider {
    private boolean access;

    public boolean isCurrentUserLoggedIn() {
        return this.access;
    }

    public boolean logIn() {
        this.access = true;
        return true;
    }
}
