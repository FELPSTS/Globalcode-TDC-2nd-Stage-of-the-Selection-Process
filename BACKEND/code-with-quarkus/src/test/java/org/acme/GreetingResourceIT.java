package org.acme;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
class GreetingResourceIT extends GreetingResourceTest {
    // A classe de teste de integração não precisa redefinir o recurso.
    // Ela herda os testes definidos em GreetingResourceTest.
}
