package com.Tamm.Hotels.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.6.0
//
// Created by Quasar Development 
//
//---------------------------------------------------


import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.AttributeInfo;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class PriceChangeStatus extends AttributeContainer implements KvmSerializable {

    
    public ArrayOfHotel_Room HotelRooms;

    public Boolean Status = false;

    public Boolean AvailableOnNewPrice = false;
    
    public String NewPrice;

    public String Currency;
    private transient java.lang.Object __source;


    public void loadFromSoap(java.lang.Object paramObj, ExtendedSoapSerializationEnvelope __envelope) {
        if (paramObj == null)
            return;
        AttributeContainer inObj = (AttributeContainer) paramObj;
        __source = inObj;
        if (inObj instanceof SoapObject) {
            SoapObject soapObject = (SoapObject) inObj;
            int size = soapObject.getPropertyCount();
            for (int i0 = 0; i0 < size; i0++) {
                PropertyInfo info = soapObject.getPropertyInfo(i0);
                if (!loadProperty(info, soapObject, __envelope)) {
                }
            } 
        }
        if (inObj.hasAttribute("Status")) {
            java.lang.Object j = inObj.getAttribute("Status");
            if (j != null) {
                Status = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("AvailableOnNewPrice")) {
            java.lang.Object j = inObj.getAttribute("AvailableOnNewPrice");
            if (j != null) {
                AvailableOnNewPrice = new Boolean(j.toString());
            }
        }
        if (inObj.hasAttribute("NewPrice")) {
            java.lang.Object j = inObj.getAttribute("NewPrice");
            if (j != null) {
                NewPrice = j.toString();
            }
        }
        if (inObj.hasAttribute("Currency")) {
            java.lang.Object j = inObj.getAttribute("Currency");
            if (j != null) {
                Currency = j.toString();
            }
        }

    }


    protected boolean loadProperty(PropertyInfo info, SoapObject soapObject, ExtendedSoapSerializationEnvelope __envelope) {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("HotelRooms")) {
            if (obj != null) {
                java.lang.Object j = obj;
                this.HotelRooms = (ArrayOfHotel_Room) __envelope.get(j, ArrayOfHotel_Room.class, false);
            }
            return true;
        }
        return false;
    }

    public java.lang.Object getOriginalXmlSource() {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (propertyIndex == 0) {
            return this.HotelRooms != null ? this.HotelRooms : SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "HotelRooms";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }



    @Override
    public int getAttributeCount() {
        return 4;
    }

    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if (index == 0) {
            info.name = "Status";
            info.namespace = "";
            if (this.Status != null) {
                info.setValue(this.Status);
            }

        }
        if (index == 1) {
            info.name = "AvailableOnNewPrice";
            info.namespace = "";
            if (this.AvailableOnNewPrice != null) {
                info.setValue(this.AvailableOnNewPrice);
            }

        }
        if (index == 2) {
            info.name = "NewPrice";
            info.namespace = "";
            if (this.NewPrice != null) {
                info.setValue(this.NewPrice);
            }

        }
        if (index == 3) {
            info.name = "Currency";
            info.namespace = "";
            if (this.Currency != null) {
                info.setValue(this.Currency);
            }

        }
    }

    @Override
    public void getAttribute(int i, AttributeInfo attributeInfo) {

    }

    @Override
    public void setAttribute(AttributeInfo attributeInfo) {

    }    
}

