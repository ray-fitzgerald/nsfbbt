package com.bbt.hackathon.nsfweb.websocket;

import org.nextrtc.signalingserver.NextRTCConfig;
import org.nextrtc.signalingserver.api.NextRTCServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@Import(NextRTCConfig.class)
public class WebSocketConfigurator implements WebSocketConfigurer {
    @Autowired
    private NextRTCServer server;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(customEndpoint(), "/signaling").setAllowedOrigins("*");
    }

    @Bean
    public ChatEndpoint customEndpoint() {
        return new ChatEndpoint(server);
    }
}