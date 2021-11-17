package starter.configuracion;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Estado.class)
@EnableConfigurationProperties(EstadoProperties.class)
public class EstadoAutoConfigure {

	private final EstadoProperties properties;

	public EstadoAutoConfigure(EstadoProperties properties) {
		this.properties = properties;
	}

	@Bean
	public Estado getStatus() {
		System.out.println("Estado: "+properties.getStatus());
		return new Estado(properties.getStatus());
	}

}
