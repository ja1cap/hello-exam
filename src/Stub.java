public class Stub {

    protected StringBuilder message;

    /**
     *
     * @param o Object
     * @return boolean
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stub)) return false;

        Stub stub = (Stub) o;

        if (message != null ? !message.equals(stub.message) : stub.message != null) return false;

        return true;
    }
}
