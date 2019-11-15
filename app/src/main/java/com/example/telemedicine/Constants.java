package com.example.telemedicine;

public class Constants {
  public static final   String DOCTOR_NAME          = "com.example.telemedicine.Name";
  public static final   String DOCTOR_SPECIALTY     = "com.example.telemedicine.Specialty";
  public static final   String DOCTOR_ADDRESS       = "com.example.telemedicine.Address";
  public static final   String DOCTOR_PHOTO_URL     = "com.example.telemedicine.PhotoUrl";
  public static final   String DOCTOR_RATING        = "com.example.telemedicine.Rating";
  public static final   String MAPVIEW_BUNDLE_KEY   = "MapViewBundleKey";
  public static final   String PATIENT_NAME         = "com.example.telemedicine.Name";
  public static final   String PATIENT_DISEASE      = "com.example.telemedicine.DISEASE";
  public static final   String PATIENT_LOCATION     = "com.example.telemedicine.LOCATION";
  public static final   String PATIENT_DESCRIPTION  = "com.example.telemedicine.DESCRIPTION";
  public static final   String SHARED_PREFS         = "com.example.telemedicine.SHARED_PREFS";
  public static final   String API_URL              = "http://81.180.72.17/";
  public static final   String REG_URL              = "api/Register/UserReg";
  public static final   String FULL_NAME            =  "FullName";
  public static final   String BIRTHDAY             = "Birthday";
  public static final   String EMAIL                = "Email";
  public static final   String PHONE                = "Phone";
  public static final   String ADDRESS              = "Address";
  public static final   String USERNAME             = "Username";
  public static final   String PASSWORD             = "Password";
  public static final   String BASE_64_PHOTO        = "Base64Photo";
  public static final   String BASE_64_PHOTO_VALUE  = "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";
  public static final   int    REQUEST_CODE         = 8841;
  public static final   int    RESULT_LOAD_PHOTO    = 666;
}
