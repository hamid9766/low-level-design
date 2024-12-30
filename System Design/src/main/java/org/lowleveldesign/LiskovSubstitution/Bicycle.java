package org.lowleveldesign.LiskovSubstitution;

public class Bicycle extends Vehicle{
    /**
     * Returns null, indicating that the implementation does not align with the expectations
     * of the base class. This violates LSP and is a deliberate design flaw for demonstration purposes.
     * @return null
     */
    @Override
    public Boolean hasEngine() {
        return null;
    }
}
