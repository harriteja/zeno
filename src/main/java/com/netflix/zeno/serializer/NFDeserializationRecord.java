/*
 *
 *  Copyright 2013 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.zeno.serializer;

import com.netflix.zeno.fastblob.record.schema.FastBlobSchema;

/**
 * Empty interface.  This is simply used to identify records which are used by the FrameworkDeserializer to deserialize.
 */
public abstract class NFDeserializationRecord {

    private final FastBlobSchema schema;

    public NFDeserializationRecord(FastBlobSchema schema) {
        this.schema = schema;
    }

    public FastBlobSchema getSchema() {
        return schema;
    }

    public String getObjectType(String fieldName) {
        return schema.getObjectType(fieldName);
    }

}
