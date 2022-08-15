package bai3;

import java.util.Arrays;

public class Point3D extends Point22D {
   private float z = 0.0f;
    public Point3D (){

    }
    public Point3D (float z){
        this.z = z;
    }
    public Point3D (float x , float y ,float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ ( float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] XYZ = {z};
        return XYZ;
    }
    @Override
    public String toString(){
        return "Mảng Là : " + Arrays.toString(getXYZ()) +" "+ super.toString();
    }
}
