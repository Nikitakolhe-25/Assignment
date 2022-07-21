package com.example.SimpleMappingProject.Controller;

import com.example.SimpleMappingProject.Entity.Address;
import com.example.SimpleMappingProject.Repo.AddressRepo;
import com.example.SimpleMappingProject.Service.AddressInterface;
import com.example.SimpleMappingProject.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController
{
//    public AddressInterface addressInterface;

//    @Autowired
//    private AddressRepo addressRepo;

    @Autowired
    private AddressService addressService;

    @PostMapping("/save")
    public Address saveAdd(@RequestBody Address address)
    {
        return addressService.saveData(address);
    }


    @GetMapping("/list")
    public List<Address> getAllList()
    {
        return addressService.getall();
    }

    @GetMapping("/save{id}")
    public Optional<Address> getAddress(@PathVariable int id)
    {
        return addressService.getAdd(id);
    }

    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address)
    {
        return addressService.saveData(address);
    }

    @DeleteMapping("delete/{id}")
    public  String delete(@PathVariable("id") int id)
    {
        addressService.deleteid(id);
        return "deleted";
    }
    @DeleteMapping("/")
    public void getall()
    {
        addressService.deleteall();
    }



}
