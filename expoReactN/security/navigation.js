import React from "react";
import {createStackNavigator} from "@react-navigation/stack";
import {NavigationContainer} from "@react-navigation/native";
import IndexPage from "../Components/pages/IndexPage";
import AuthMain from "../Components/pages/Auth/AuthMain";
import AuthConfirm from "../Components/pages/Auth/AuthConfirm";

const Stack = createStackNavigator();

export default function Navigate(){
    return(<NavigationContainer>
        <Stack.Navigator>
            <Stack.Screen
                name = "Index"
                component={IndexPage}
                options={{headerShown: false}}
            />
            <Stack.Screen
                name = "Auth/main"
                component={AuthMain}
                options={{title:'Авторизация'}}
            />
            <Stack.Screen
                name = "Auth/confirm"
                component={AuthConfirm}
                options={{title:'Авторизация'}}
            />
        </Stack.Navigator>
    </NavigationContainer>)
}
