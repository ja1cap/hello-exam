public class Nervous {

    protected String type;

    /**
     *
     * @param type String
     */
    public Nervous(String type) {
        this.type = type;
    }

    /**
     *
     * @param o Object
     * @return boolean
     */
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Nervous)) return false;

        Nervous nervous = (Nervous) o;

        if (type != null ? !type.equals(nervous.type) : nervous.type != null) return false;

        return true;

    }

}
