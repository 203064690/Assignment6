package hotelReservation.domain;



import java.io.Serializable;

/**
 * Assignment 6
 * Domain Driven Design
 * Dylan Baadjies
 * 203064690.
 */

public class Customer implements Serializable
{

    private Long ID;
    private String ID_number;
    private String customer_firstnames;
    private String customer_lastname;



    private Customer(){}

    public Customer( Builder builder )
    {
        ID = builder.ID;
        ID_number = builder.ID_number;
        customer_firstnames = builder.customer_firstnames;
        customer_lastname = builder.customer_lastname;
    }

    public Long getID()
    {
        return ID;
    }
    public String getIDNumber()
    {
        return ID_number;
    }
    public String getFirstnames()
    {
        return customer_firstnames;
    }
    public String getLastname()
    {
        return customer_lastname;
    }

    public static class Builder
    {
        private Long ID;
        private String ID_number;
        private String customer_firstnames;
        private String customer_lastname;

        public Builder( String ID_number )
        {
            this.ID_number = ID_number;
        }
        public Builder ID( Long value )
        {
            this.ID = value;
            return this;
        }
        public Builder customer_firstnames( String value )
        {
            this.customer_firstnames = value;
            return this;
        }
        public Builder customer_lastname( String value )
        {
            this.customer_lastname = value;
            return this;
        }

        public Builder copy( Customer value )
        {
            this.ID_number = value.getIDNumber();
            this.ID = value.getID();
            this.customer_firstnames = value.getFirstnames();
            this.customer_lastname = value.getLastname();


            return this;
        }

        public Customer build()
        {
            return new Customer( this );
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        return !(ID != null ? !ID.equals(customer.ID) : customer.ID != null);
    }
    @Override
    public int hashCode()
    {
        return ID != null ? ID.hashCode() : 0;
    }
}
