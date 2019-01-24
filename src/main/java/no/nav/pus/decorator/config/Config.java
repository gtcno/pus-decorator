package no.nav.pus.decorator.config;

import lombok.Data;
import lombok.experimental.Accessors;
import no.nav.pus.decorator.proxy.BackendProxyConfig;
import no.nav.pus.decorator.spa.SPAConfig;

import javax.validation.Valid;
import java.util.List;

@Data
@Accessors(chain = true)
public class Config {

    public String contexPath;

    @Valid
    public List<SPAConfig> spa;

    @Valid
    public List<BackendProxyConfig> proxy;

}
