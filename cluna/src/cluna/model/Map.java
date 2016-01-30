/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluna.model;
import java.io.Serializable;
/**
 *
 * @author lindsayprigmore
 */
public class Map implements Serializable{
 
    private int numRows;
    private int numCols;

    public Map() {
    }
    
    

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numRows;
        hash = 97 * hash + this.numCols;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numCols != other.numCols) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "numRows=" + numRows + ", numCols=" + numCols + '}';
    }
    
    
}
