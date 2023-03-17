// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Doctor.java

import java.util.Vector;

public class Doctor extends Person
{

    public Doctor()
    {
    }

    public String getSpeciality()
    {
        return null;
    }

    public Patient accesPatient(Patient patient)
    {
        return null;
    }

    public Patient declinePatient(Patient patient)
    {
        return null;
    }

    public void removePatient(Patient patient)
    {
    }

    public Patient[] getPatientList()
    {
        return null;
    }

    public void addDisease(Patient patient, Disease disease)
    {
    }

    public void addSample(Sample sample)
    {
    }

    public void creadRaport(Patient patient)
    {
    }

    public void getRaport(Patient patient)
    {
    }

    public void checkResults(Patient patient)
    {
    }

    public volatile boolean Signup(String s, String s1, String s2)
    {
        return super.Signup(s, s1, s2);
    }

    public volatile boolean Login(String s, String s1, String s2)
    {
        return super.Login(s, s1, s2);
    }

    public String speciality;
    public Vector patients;
}
