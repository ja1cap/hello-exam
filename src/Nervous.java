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

        if(type != null && nervous.type != null){
            return type.equals(nervous.type);
        } else if (type == null && nervous.type == null){
            return true;
        }

        return false;

    }

}
