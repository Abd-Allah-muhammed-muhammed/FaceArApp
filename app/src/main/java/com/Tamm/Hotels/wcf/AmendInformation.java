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
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class AmendInformation extends AttributeContainer implements KvmSerializable {

    
    public CheckInReq CheckIn;

    public CheckOutReq CheckOut;

    public ArrayOfRoomReq Rooms;
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

    }


    protected boolean loadProperty(PropertyInfo info, SoapObject soapObject, ExtendedSoapSerializationEnvelope __envelope) {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("CheckIn")) {
            if (obj != null) {
                java.lang.Object j = obj;
                this.CheckIn = (CheckInReq) __envelope.get(j, CheckInReq.class, false);
            }
            return true;
        }
        if (info.name.equals("CheckOut")) {
            if (obj != null) {
                java.lang.Object j = obj;
                this.CheckOut = (CheckOutReq) __envelope.get(j, CheckOutReq.class, false);
            }
            return true;
        }
        if (info.name.equals("Rooms")) {
            if (obj != null) {
                java.lang.Object j = obj;
                this.Rooms = (ArrayOfRoomReq) __envelope.get(j, ArrayOfRoomReq.class, false);
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
            return this.CheckIn != null ? this.CheckIn : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 1) {
            return this.CheckOut != null ? this.CheckOut : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 2) {
            return this.Rooms != null ? this.Rooms : SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = CheckInReq.class;
            info.name = "CheckIn";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 1) {
            info.type = CheckOutReq.class;
            info.name = "CheckOut";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 2) {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "Rooms";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }


}

