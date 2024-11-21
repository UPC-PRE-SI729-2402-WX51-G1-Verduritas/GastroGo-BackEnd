package pe.upc.gastrogobackend.orders.interfaces.rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.upc.gastrogobackend.orders.domain.model.commands.CreateOrderCommand;
import pe.upc.gastrogobackend.orders.domain.services.OrderCommandService;

@OpenAPIDefinition(
        info = @Info(
                title = "API-Gastrogo",
                version = "1.0",
                description = "Mantenimiento de una Persona"
        )
)

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderCommandService orderCommandService;
    @Operation(summary = "Get all orders")
    @GetMapping("/all")


    public ResponseEntity<String> obtenerPersona(){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("order1");

    }

        @DeleteMapping("/delete")
    public ResponseEntity<String> BorrarOrder() {

     return ResponseEntity
             .status(HttpStatus.OK)
            .body("order1");
    }
    @PostMapping("/post")
    public ResponseEntity<String> PostOrder(@RequestBody CreateOrderCommand createOrderCommand) {
      orderCommandService.handle(createOrderCommand);
        return ResponseEntity
                .status(HttpStatus.OK)

                .body("order1");
    }
}
