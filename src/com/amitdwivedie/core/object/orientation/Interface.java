package com.amitdwivedie.core.object.orientation;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Amit Dwivedi
 *
 */
public interface Interface {

    void show() throws IOException;

    void display() throws NullPointerException, SQLException;
}

class InterfasceTest implements Interface{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() throws NullPointerException, SQLException{
        // TODO Auto-generated method stub
        
    }
    
}