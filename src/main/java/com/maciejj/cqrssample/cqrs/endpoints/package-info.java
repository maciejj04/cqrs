package com.maciejj.cqrssample.cqrs.endpoints;

/*
    The purpose of this package is to separate service logic from endpoints. This approach gives developer choice
    which HTTP or communication (SOAP/REST) protocols to use. Application purpose: gRPC is in TODO list.

    Each endpoint only converts request data type to CQRS Command data type.
 */