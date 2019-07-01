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

public class TagInfos extends AttributeContainer implements KvmSerializable {


    public Integer Id = 0;
    
    public String Name;

    public String Category;

    public String City;

    public String Country;
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
        if (inObj.hasAttribute("Id")) {
            java.lang.Object j = inObj.getAttribute("Id");
            if (j != null) {
                Id = Integer.parseInt(j.toString());
            }
        }
        if (inObj.hasAttribute("Name")) {
            java.lang.Object j = inObj.getAttribute("Name");
            if (j != null) {
                Name = j.toString();
            }
        }
        if (inObj.hasAttribute("Category")) {
            java.lang.Object j = inObj.getAttribute("Category");
            if (j != null) {
                Category = j.toString();
            }
        }
        if (inObj.hasAttribute("City")) {
            java.lang.Object j = inObj.getAttribute("City");
            if (j != null) {
                City = j.toString();
            }
        }
        if (inObj.hasAttribute("Country")) {
            java.lang.Object j = inObj.getAttribute("Country");
            if (j != null) {
                Country = j.toString();
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
        return 5;
    }

    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if (index == 0) {
            info.name = "Id";
            info.namespace = "";
            if (this.Id != null) {
                info.setValue(this.Id);
            }

        }
        if (index == 1) {
            info.name = "Name";
            info.namespace = "";
            if (this.Name != null) {
                info.setValue(this.Name);
            }

        }
        if (index == 2) {
            info.name = "Category";
            info.namespace = "";
            if (this.Category != null) {
                info.setValue(this.Category);
            }

        }
        if (index == 3) {
            info.name = "City";
            info.namespace = "";
            if (this.City != null) {
                info.setValue(this.City);
            }

        }
        if (index == 4) {
            info.name = "Country";
            info.namespace = "";
            if (this.Country != null) {
                info.setValue(this.Country);
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

