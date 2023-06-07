///////////////////////
//
// Filename: ReflectionType.java
// Author: Daniel Long
// Course: ICS4U1
// Description: An enum listing the various reflection types.
//
///////////////////////

package Core.Utility.Enum;

public enum ReflectionType {
    SPECULAR("Specular"),
    DIFFUSE("Diffuse");

    public static final String[] REFLECTION_TYPE_MAMES = {ReflectionType.DIFFUSE.getName(), ReflectionType.SPECULAR.getName()};
    private String name;

    ReflectionType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
