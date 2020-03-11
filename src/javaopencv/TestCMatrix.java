/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaopencv;

import cezeri.matrix.CMatrix;

/**
 *
 * @author elcezeri
 */
public class TestCMatrix {
    public static void main(String[] args) {
        CMatrix cm=CMatrix.getInstance()
                .range(-360,360,1)
                .toRadians()
                .exp()                
//                .multiplyScalar(5)
                .sin()
                .replicateColumn(5)
                .plot()
                ;
    }
}
