package br.com.fiap.checkpoint2.specs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "API - Pedidos",
        version = "1.0.0",
        description = "<table>   \n  <thead>  \n    <tr>\n      <th>Version</th>\n      <th>Author</th>\n      <th>Data</th>\n      <th>Changes</th>\n    </tr>  \n  </thead>\n  <tbody>\n    <tr>\n      <td>1.0.0</td>\n      <td>Davi Quental e Matheus Alves</td>\n      <td>2022-10-12</td>\n      <td>[CHECKPOINT2] Versão inicial</td>\n    </tr>\n  </tbody>\n</table>\n\n## Objetivo\n\nAPI para gerenciamento de pedidos, permitindo a criação, listagem, atualização e deleção dos mesmos.\n\n## Público-Alvo\n\n  Até a data desta especificação os potenciais consumidores dessa API são qualquer loja que necessite da implementação de gerenciamento de pedidos em seu negócio.\n  \n## Provedores\n\nO backend provedor será a máquina local que executar esse projeto.\n\n## Contexto em que a API se Insere\n\nEsta API está inserida no conjunto de APIs de um E-Commerce para gerenciamento logístico."
))
public class SwaggerConfig {
}
