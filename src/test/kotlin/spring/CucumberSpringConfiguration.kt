package spring

import Checkout
import io.cucumber.spring.CucumberContextConfiguration
import nice_bank.Account
import nice_bank.CashSlot
import nice_bank.Teller
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.ContextHierarchy



@CucumberContextConfiguration
@ContextHierarchy(
    ContextConfiguration("classpath:cucumber.xml"),
    ContextConfiguration(classes = [Account::class, CashSlot::class, Teller::class, Checkout::class])
)
class CucumberSpringConfiguration