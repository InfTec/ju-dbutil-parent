package ch.inftec.ju.db.specific;

import org.springframework.test.context.ContextConfiguration;

import ch.inftec.ju.db.BasicDbTest;

@ContextConfiguration(locations="classpath:/ch/inftec/ju/db/specific/DbTestsOracle-context.xml", inheritLocations=false)
public class OracleBasicDbTest extends BasicDbTest {
}
