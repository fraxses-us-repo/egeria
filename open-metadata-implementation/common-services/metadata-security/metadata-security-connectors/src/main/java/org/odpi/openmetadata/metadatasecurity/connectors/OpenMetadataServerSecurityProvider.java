/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.metadatasecurity.connectors;

import org.odpi.openmetadata.frameworks.connectors.ConnectorProviderBase;
import org.odpi.openmetadata.repositoryservices.auditlog.OMRSAuditingComponent;


/**
 * OpenMetadataServerSecurityProvider provides implementation of the connector provider for the
 * Open Metadata Server Security connector.
 */
public abstract class OpenMetadataServerSecurityProvider extends ConnectorProviderBase
{
    /**
     * Constructor used to initialize the ConnectorProviderBase with the Java class name of the specific
     * Security Connector implementation.
     */
    public OpenMetadataServerSecurityProvider()
    {
        super.setConnectorComponentDescription(OMRSAuditingComponent.SERVER_SECURITY_CONNECTOR);

        Class<?>        connectorClass = OpenMetadataServerSecurityConnector.class;

        super.setConnectorClassName(connectorClass.getName());
    }
}