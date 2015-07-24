package com.s24.search.solr.analysis.jdbc;

/**
 * Additional Parameters for configuring JDBC based readers.
 * 
 * @author Shopping24 GmbH, Torsten Bøgh Köster (@tboeghk)
 */
public enum JdbcParams {

   /**
    * Parameter: JNDI name of data source.
    */
   JNDI_NAME("jndiName"),

   /**
    * Parameter: SQL to load synonyms.
    */
   SQL("sql"),

   /**
    * Parameter: Ignore a missing database?.
    */
   IGNORE("ignoreMissingDatabase");

   /**
    * Name of this parameter.
    */
   private final String name;

   /**
    * Constructor.
    *
    * @param name Name of the parameter.
    */
   JdbcParams(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return name;
   }

}