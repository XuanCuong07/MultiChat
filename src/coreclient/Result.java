/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreclient;

/**
 *
 * @author BVCN 88
 */
public class Result {
    public String mActionType;
    public String mResultCode;
    public String mContent;

    public Result(String mActionType, String mResultCode, String mContent) {
        this.mActionType = mActionType;
        this.mResultCode = mResultCode;
        this.mContent = mContent;
    }
}
