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

import java.util.Hashtable;

public class AmendGuestReq extends AttributeContainer implements KvmSerializable {


    public Enums.AmendActionReq Action = Enums.AmendActionReq.Rename;
    
    public String ExistingName;

    public Enums.GuestType GuestType = Enums.GuestType.Adult;
    
    public String Title;

    public String FirstName;

    public String LastName;

    public Integer Age = 0;
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
        if (inObj.hasAttribute("Action")) {
            java.lang.Object j = inObj.getAttribute("Action");
            if (j != null) {
                Action = Enums.AmendActionReq.fromString(j.toString());
            }
        }
        if (inObj.hasAttribute("ExistingName")) {
            java.lang.Object j = inObj.getAttribute("ExistingName");
            if (j != null) {
                ExistingName = j.toString();
            }
        }
        if (inObj.hasAttribute("GuestType")) {
            java.lang.Object j = inObj.getAttribute("GuestType");
            if (j != null) {
                GuestType = Enums.GuestType.fromString(j.toString());
            }
        }
        if (inObj.hasAttribute("Title")) {
            java.lang.Object j = inObj.getAttribute("Title");
            if (j != null) {
                Title = j.toString();
            }
        }
        if (inObj.hasAttribute("FirstName")) {
            java.lang.Object j = inObj.getAttribute("FirstName");
            if (j != null) {
                FirstName = j.toString();
            }
        }
        if (inObj.hasAttribute("LastName")) {
            java.lang.Object j = inObj.getAttribute("LastName");
            if (j != null) {
                LastName = j.toString();
            }
        }
        if (inObj.hasAttribute("Age")) {
            java.lang.Object j = inObj.getAttribute("Age");
            if (j != null) {
                Age = Integer.parseInt(j.toString());
            }
        }

    }


    protected boolean loadProperty(PropertyInfo info, SoapObject soapObject, ExtendedSoapSerializationEnvelope __envelope) {
        java.lang.Object obj = info.getValue();
        return false;
    }

    public java.lang.Object getOriginalXmlSource() {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }



    @Override
    public int getAttributeCount() {
        return 7;
    }

    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if (index == 0) {
            info.name = "Action";
            info.namespace = "";
            if (this.Action != null) {
                info.setValue(this.Action);
            }

        }
        if (index == 1) {
            info.name = "ExistingName";
            info.namespace = "";
            if (this.ExistingName != null) {
                info.setValue(this.ExistingName);
            }

        }
        if (index == 2) {
            info.name = "GuestType";
            info.namespace = "";
            if (this.GuestType != null) {
                info.setValue(this.GuestType);
            }

        }
        if (index == 3) {
            info.name = "Title";
            info.namespace = "";
            if (this.Title != null) {
                info.setValue(this.Title);
            }

        }
        if (index == 4) {
            info.name = "FirstName";
            info.namespace = "";
            if (this.FirstName != null) {
                info.setValue(this.FirstName);
            }

        }
        if (index == 5) {
            info.name = "LastName";
            info.namespace = "";
            if (this.LastName != null) {
                info.setValue(this.LastName);
            }

        }
        if (index == 6) {
            info.name = "Age";
            info.namespace = "";
            if (this.Age != null) {
                info.setValue(this.Age);
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

