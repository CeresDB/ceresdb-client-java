/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ceresdb.common;

/**
 * System properties option keys
 *
 * @author jiachun.fjc
 */
public final class OptKeys {

    public static final String OS_NAME                   = "os.name";
    public static final String RW_LOGGING                = "CeresDBx.client.read.write.rw_logging";
    public static final String COLLECT_WROTE_DETAIL      = "CeresDBx.client.write.collect_wrote_detail";
    public static final String USE_OS_SIGNAL             = "CeresDBx.client.use_os_signal";
    public static final String REPORT_PERIOD             = "CeresDBx.reporter.period_minutes";
    public static final String SIG_OUT_DIR               = "CeresDBx.signal.out_dir";
    public static final String HTTP_READ_TIMEOUT_MS      = "CeresDBx.http.read_timeout_ms";
    public static final String HTTP_WRITE_TIMEOUT_MS     = "CeresDBx.http.write_timeout_ms";
    public static final String GRPC_CONN_RESET_THRESHOLD = "CeresDBx.grpc.conn.failures.reset_threshold";
    public static final String AVAILABLE_CPUS            = "CeresDBx.available_cpus";
    public static final String NAME_VALIDATE             = "CeresDBx.avro.name_validate";
    public static final String WRITE_LIMIT_PERCENT       = "CeresDBx.rpc.write.limit_percent";

    private OptKeys() {
    }
}
