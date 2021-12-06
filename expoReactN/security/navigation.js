import React from "react";
import {createStackNavigator} from "@react-navigation/stack";
import {NavigationContainer} from "@react-navigation/native";
import {Index} from "../Components/pages";

const Stack = createStackNavigator();

export default function Navigate(){
    return(<NavigationContainer>
        <Stack.Navigator>
            <Stack.Screen
            name = "Index"
            component={Index}
            oprions={{title:'Главная'}}
            />
            <Stack.Screen
                name = "Authorize"
                component={Authorize}
                oprions={{title:'Главная'}}
            />
        </Stack.Navigator>
    </NavigationContainer>)
}
