#hazelcast-security-examples

## Introduction

Sample code for Hazelcast Client Login Security implemented with JAAS.  There are 3 classes.

1. Client : Sets a UserNamePasswordCredentials class on the Client Config and then connects to the Member.
2. Member : This is a Hazelcast Cluster member that is initialised with the Hazelcast.xml file
2. ClientLoginModule : This is executed on the Member when the Client connects.  This class implements the javax.security.auth.spi.LoginModule

## Requirements

The examples require an Enterprise Version of Hazelcast that require a key.  You can obtain this key via an Enterprise Agreement or
by using a 30 day trial key which can apply for here...

http://www.hazelcast.com/products/hazelcast-enterprise/#form

Once you have the key you will need to start the MEMBER Java Process with the following VM switch...

-Dhazelcast.enterprise.license.key=<YOUR_ENTERPRISE_KEY_HERE>

It is recommended to read the following guide to Authentication using JAAS...

http://www.javaranch.com/journal/2008/04/authentication-using-JAAS.html




