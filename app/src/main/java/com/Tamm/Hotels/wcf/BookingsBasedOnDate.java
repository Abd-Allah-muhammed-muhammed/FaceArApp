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

public class BookingsBasedOnDate extends AttributeContainer implements KvmSerializable {


    public Integer Index = 0;
    
    public String BookingId;

    public String ConfirmationNo;

    public String BookingDate;

    public String Currency;

    public String AgentMarkup;

    public String AgencyName;

    public Enums.APIHotelBookingStatus BookingStatus = Enums.APIHotelBookingStatus.Failed;
    
    public String BookingPrice;

    public String TripName;

    public String TBOHotelCode;

    public String Remarks;
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
        if (info.name.equals("Index")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.Index = Integer.parseInt(j.toString());
                    }
                } else if (obj instanceof Integer) {
                    this.Index = (Integer) obj;
                }
            }
            return true;
        }
        if (info.name.equals("BookingId")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.BookingId = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.BookingId = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("ConfirmationNo")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.ConfirmationNo = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.ConfirmationNo = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("BookingDate")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.BookingDate = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.BookingDate = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("Currency")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.Currency = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.Currency = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("AgentMarkup")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.AgentMarkup = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.AgentMarkup = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("AgencyName")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.AgencyName = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.AgencyName = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("BookingStatus")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.BookingStatus = Enums.APIHotelBookingStatus.fromString(j.toString());
                    }
                } else if (obj instanceof Enums.APIHotelBookingStatus) {
                    this.BookingStatus = (Enums.APIHotelBookingStatus) obj;
                }
            }
            return true;
        }
        if (info.name.equals("BookingPrice")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.BookingPrice = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.BookingPrice = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("TripName")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.TripName = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.TripName = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("TBOHotelCode")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.TBOHotelCode = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.TBOHotelCode = (String) obj;
                }
            }
            return true;
        }
        if (info.name.equals("Remarks")) {
            if (obj != null) {
                if (obj.getClass().equals(SoapPrimitive.class)) {
                    SoapPrimitive j = (SoapPrimitive) obj;
                    if (j.toString() != null) {
                        this.Remarks = j.toString();
                    }
                } else if (obj instanceof String) {
                    this.Remarks = (String) obj;
                }
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
            return Index;
        }
        if (propertyIndex == 1) {
            return this.BookingId != null ? this.BookingId : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 2) {
            return this.ConfirmationNo != null ? this.ConfirmationNo : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 3) {
            return this.BookingDate != null ? this.BookingDate : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 4) {
            return this.Currency != null ? this.Currency : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 5) {
            return this.AgentMarkup != null ? this.AgentMarkup : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 6) {
            return this.AgencyName != null ? this.AgencyName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 7) {
            return this.BookingStatus != null ? this.BookingStatus.toString() : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 8) {
            return this.BookingPrice != null ? this.BookingPrice : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 9) {
            return this.TripName != null ? this.TripName : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 10) {
            return this.TBOHotelCode != null ? this.TBOHotelCode : SoapPrimitive.NullSkip;
        }
        if (propertyIndex == 11) {
            return this.Remarks != null ? this.Remarks : SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 12;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        if (propertyIndex == 0) {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "Index";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 1) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BookingId";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 2) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ConfirmationNo";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 3) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BookingDate";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 4) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Currency";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 5) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AgentMarkup";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 6) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "AgencyName";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 7) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BookingStatus";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 8) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "BookingPrice";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 9) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TripName";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 10) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TBOHotelCode";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
        if (propertyIndex == 11) {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Remarks";
            info.namespace = "http://TekTravel/HotelBookingApi";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }


}

