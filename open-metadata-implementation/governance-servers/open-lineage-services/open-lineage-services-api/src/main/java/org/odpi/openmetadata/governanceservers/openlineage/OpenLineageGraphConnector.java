/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.governanceservers.openlineage;

import org.odpi.openmetadata.frameworks.auditlog.AuditLog;
import org.odpi.openmetadata.frameworks.connectors.ffdc.ConnectorCheckedException;
import org.odpi.openmetadata.governanceservers.openlineage.ffdc.OpenLineageException;
import org.odpi.openmetadata.governanceservers.openlineage.graph.LineageGraph;

public interface OpenLineageGraphConnector {

    /**
     * Indicates that the connector is completely configured and can begin processing.
     *
     * @throws ConnectorCheckedException there is a problem within the connector.
     */
    void start() throws ConnectorCheckedException;

    /**
     * Free up any resources held since the connector is no longer needed.
     *
     * @throws ConnectorCheckedException there is a problem within the connector.
     */
    void disconnect() throws ConnectorCheckedException;

    /**
     * Initialize the connectors
     * @param auditLog logging destination
     * @throws OpenLineageException internal error
     */
    void initializeGraphDB(AuditLog auditLog) throws OpenLineageException;

    /**
     * Task that the scheduler performs based on the interval
     */
    void performLineageGraphJob();

    OpenLineageQueryService getLineageQueryService();

    LineageGraph getLineageStorageService();
}
