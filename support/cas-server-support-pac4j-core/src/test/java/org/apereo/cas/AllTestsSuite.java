
package org.apereo.cas;

import org.apereo.cas.audit.DelegatedAuthenticationAuditResourceResolverTests;
import org.apereo.cas.authentication.principal.provision.GroovyDelegatedClientUserProfileProvisionerTests;
import org.apereo.cas.authentication.principal.provision.RestfulDelegatedClientUserProfileProvisionerTests;
import org.apereo.cas.validation.DelegatedAuthenticationServiceTicketValidationAuthorizerTests;
import org.apereo.cas.web.pac4j.DelegatedSessionCookieCipherExecutorTests;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@SelectClasses({
    DelegatedSessionCookieCipherExecutorTests.class,
    DelegatedAuthenticationAuditResourceResolverTests.class,
    DelegatedAuthenticationServiceTicketValidationAuthorizerTests.class,
    GroovyDelegatedClientUserProfileProvisionerTests.class,
    RestfulDelegatedClientUserProfileProvisionerTests.class
})
public class AllTestsSuite {
}
